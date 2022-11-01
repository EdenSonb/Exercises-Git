package server;

import java.time.LocalDate;

public class JobPosition {
    private LocalDate publishedDate;
    private String title;
    private String description;
    private String location;
    private int salaryCap;
    private boolean isRemote;
    private int yearsOfExperience;

    public static class Builder {
        private LocalDate publishedDate;
        private String title;
        private boolean isRemote;
        private int yearsOfExperience;

        private String description = "";
        private String location = "Tel Aviv";
        private int salaryCap = 5000;

        public Builder(LocalDate publishedDate,String title, boolean isRemote, int yearsOfExperience){
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
            this.yearsOfExperience = yearsOfExperience;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder location(String location){
            this.location = location;
            return this;
        }

        public Builder salaryCap(int salaryCap){
            this.salaryCap = salaryCap;
            return this;
        }

        public JobPosition build(){
            return new JobPosition(this);
        }
    }

    public JobPosition(Builder builder){
        this.publishedDate = builder.publishedDate;
        this.title = builder.title;;
        this.isRemote = builder.isRemote;;
        this.yearsOfExperience = builder.yearsOfExperience;;
        this.description = builder.description;
        this.location = builder.location;
        this.salaryCap = builder.salaryCap;
    }

    public String toString(){
        return "published date : " + publishedDate +
                "\ntitle : " + title +
                "\ndescription : " + description +
                "\nlocation : " + location +
                "\nsalary cap : " + salaryCap +
                "\nis remote : " + isRemote +
                "\nyears of experience : " + yearsOfExperience;
    }
}
