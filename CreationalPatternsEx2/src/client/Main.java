package client;

import server.JobPosition;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        JobPosition job = new JobPosition.Builder(LocalDate.now(), "I'm Eden", true, 5).location("Herzliya").salaryCap(10000).build();
        System.out.println(job.toString());
    }
}

