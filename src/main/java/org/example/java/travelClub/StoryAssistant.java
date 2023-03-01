package org.example.java.travelClub;

import org.example.java.travelClub.entity.TravelClub;
import org.example.java.travelClub.util.DateUtil;

public class StoryAssistant {
    public static void main(String[] args) {
//        System.out.println(DateUtil.today());
        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub Intro");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());
    }
}