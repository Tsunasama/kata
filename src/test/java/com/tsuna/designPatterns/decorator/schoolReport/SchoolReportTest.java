package com.tsuna.designPatterns.decorator.schoolReport;

import com.tsuna.designPatterns.decorator.schoolReport.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SchoolReportTest {
    //Using decorator to build first report
    private SchoolReport buildDecoratedReportWithSortAndHigh(){
        //The real report
        SchoolReport report=new MySchoolReport();
        //Base decorator
        SchoolReport reportDecorator=new ReportDecorator(report);
        //Build my first decorated report
        SchoolReport highDecoratedMySchoolReport=new HignScoreDecorator(reportDecorator);
        SchoolReport reportWithSortAndHigh=new SortScoreDecorator(highDecoratedMySchoolReport);
        return reportWithSortAndHigh;
    }

    //Using decorator to build second report
    private SchoolReport buildDecoratedReportWithHighAndSort(){
        //The real report
        SchoolReport report=new MySchoolReport();
        //Base decorator
        SchoolReport reportDecorator=new ReportDecorator(report);
        //Build my second decorated report
        SchoolReport sortDecoratedMyShoolReport=new SortScoreDecorator(reportDecorator);
        SchoolReport reportWithHighAndSort=new HignScoreDecorator(sortDecoratedMyShoolReport);
        return reportWithHighAndSort;
    }

    @Test
    public void testReportWithHighAndSort(){
        SchoolReport decoratedReport = buildDecoratedReportWithHighAndSort();

        String report;
        report = "I got a very good grade score on PE with 92.\n";
        report += "I got a very good sort in my class which is 23.\n";
        report += "Hello!\nYour son has got grades following:\n" +
                "English:85 Math:72 PE:92 Nature:69\n" +
                "Please sign here:\n";

        Assert.assertEquals(report,decoratedReport.report());
    }

    @Test
    public void testReportWithSortAndHigh(){
        SchoolReport decoratedReport = buildDecoratedReportWithSortAndHigh();
        String report;
        report = "I got a very good sort in my class which is 23.\n";
        report += "I got a very good grade score on PE with 92.\n";
        report += "Hello!\nYour son has got grades following:\n" +
                "English:85 Math:72 PE:92 Nature:69\n" +
                "Please sign here:\n";

        Assert.assertEquals(report,decoratedReport.report());
    }
}
