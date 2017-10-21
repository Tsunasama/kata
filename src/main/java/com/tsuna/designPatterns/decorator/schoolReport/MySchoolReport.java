package com.tsuna.designPatterns.decorator.schoolReport;

class MySchoolReport extends SchoolReport {
    String report() {
        return "Hello!\nYour son has got grades following:\n" +
                "English:85 Math:72 PE:92 Nature:69\n" +
                "Please sign here:\n";
    }

    String sign() {
        return "Tsuna Sawada";
    }
}
