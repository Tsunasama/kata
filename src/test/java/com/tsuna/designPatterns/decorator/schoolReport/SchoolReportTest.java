package com.tsuna.designPatterns.decorator.schoolReport;

import com.tsuna.designPatterns.decorator.schoolReport.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SchoolReportTest {
    private SchoolReport report;
    private SchoolReport reportDecorator;
    private SchoolReport reportWithHighAndSort;
    private SchoolReport reportWithSortAndHigh;

    @Before
    public void instantiate(){
        report=new MySchoolReport();
        //Base decorator
        reportDecorator=new ReportDecorator(report);
        //Build my first decorated report
        SchoolReport highDecoratedMySchoolReport=new HignScoreDecorator(reportDecorator);
        reportWithSortAndHigh=new SortScoreDecorator(highDecoratedMySchoolReport);
        //Build my second decorated report
        SchoolReport sortDecoratedMyShoolReport=new SortScoreDecorator(reportDecorator);
        reportWithHighAndSort=new HignScoreDecorator(sortDecoratedMyShoolReport);
    }

    @Test
    public void testReportWithHighAndSort(){
        String report;
        report = "I got a very good grade score on PE with 92.\n";
        report += "I got a very good sort in my class which is 23.\n";
        report += "Hello!\nYour son has got grades following:\n" +
                "English:85 Math:72 PE:92 Nature:69\n" +
                "Please sign here:\n";

        Assert.assertEquals(report,reportWithHighAndSort.report());
    }

    @Test
    public void testReportWithSortAndHigh(){
        String report;
        report = "I got a very good sort in my class which is 23.\n";
        report += "I got a very good grade score on PE with 92.\n";
        report += "Hello!\nYour son has got grades following:\n" +
                "English:85 Math:72 PE:92 Nature:69\n" +
                "Please sign here:\n";

        Assert.assertEquals(report,reportWithSortAndHigh.report());
    }
}
