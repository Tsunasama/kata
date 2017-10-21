package com.tsuna.designPatterns.decorator.schoolReport;

class HignScoreDecorator extends ReportDecorator {
    HignScoreDecorator(SchoolReport report) {
        super(report);
    }

    private String reportHighScore(){
        return "I got a very good grade score on PE with 92.\n";
    }

    @Override
    String report() {
        return reportHighScore()+super.report();
    }
}
