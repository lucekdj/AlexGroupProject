package com.devxschool;

public class Clock {
    public int hours;

    public int minutes;
    public int seconds;

    public Clock() {
        // TODO implement no args constructor
        this(12, 0, 0);


    }

    public Clock(int seconds) {
        // TODO implement one arg constructor


        this(seconds / 3600, seconds% 3600/60, seconds % 3600 %1);




    }

    public Clock(int hours, int minutes, int seconds) {
        //TODO implement all args constructor


        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;

        }
    }
    public void setClock(int seconds) {
        //TODO implement this method
        if (seconds >= 0 && seconds < 86400){
            this.hours = seconds / 3600;
            this.minutes = seconds % 3600 / 60;
            this.seconds = seconds % 3600 % 60;
        }

    }

    public int getHours() {
        //TODO implement this method

        return this.hours;

    }

    public void setHours(int hours) {
        //TODO implement this method
        if (hours >= 0 && hours < 24){
            this.hours = hours;
        }

    }

    public int getMinutes() {
        //TODO implement this method
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        //TODO implement this method
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }else {
            this.minutes = minutes%60;
            this.hours++;
        }
    }
    public int getSeconds() {
        //TODO implement this method
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        //TODO implement this method
        if (seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }else {
            this.seconds = seconds % 60;
            this.minutes++;
        }

    }

    public void tick() {
        //TODO implement this method
        if ( seconds == 59 ){
            seconds = 0;

            if (minutes == 59) {
                minutes = 0;

                if (hours == 23){
                    hours = 0;

                }else {
                    hours++;
                }

            }else {
                minutes++;
            }

        }else{
            seconds++;
        }

    }







    public void tickDown() {
        //TODO implement this method
        if ( seconds == 0 ){
            seconds = 59;

            if (minutes == 0) {
                minutes = 59;

                if (hours == 0){
                    hours = 23;

                }else {
                    hours--;
                }

            }else {
                minutes--;
            }

        }else{
            seconds--;
        }

    }

    public void addClock(Clock clock) {
        //TODO implement this method
        int seconds = this.getSeconds() + clock.getSeconds();
        int minutes = 0;
        int hours = 0;
        if (seconds > 59) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        minutes += this.getMinutes() + clock.getMinutes();
        if (minutes > 59) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        hours = hours + this.hours + clock.getHours();
        this.setSeconds(seconds);
        this.setMinutes(minutes);
        this.setHours(hours);
    }




    public Clock subtractClock(Clock clock) {
        //TODO implement this method
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        seconds = this.getSeconds() - clock.getSeconds();
        if (seconds < 0) {
            minutes--;
            seconds = 60 - Math.abs(seconds);
        }
        minutes += this.getMinutes() - clock.getMinutes();

        if (minutes < 0) {
            hours--;
            minutes = 60 - Math.abs(minutes);
        }
        hours += this.hours - clock.getHours();
        return new Clock(hours, minutes, seconds);
    }


    @Override
    public String toString() {
        return "(" + String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds()) + ")";
    }
}