package org.example.java.travelClub.entity;

import org.example.java.travelClub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    // Fields
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MIN_INTRO_LENGTH = 10;
    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;
//    private String message;

//    안에서만 호출 가능
    private TravelClub(){
        this.id = UUID.randomUUID().toString();
    }
    public TravelClub(String clubName, String intro) {
        // this는 참조하고 있는 레퍼런스 변수를 가르킴. 인스턴스 객체가 여러개일 경우 구분할 수 있는 것.
        this();
        setClubName(clubName);
        setIntro(intro);
        this.intro = intro;
        this.foundationDay = DateUtil.today();
    }

    /*
    this 사용 예
    public TravelClub(String clubName, String intro, String message) {
        this(clubName, intro);
        this.message = message;
    }
*/

    // methods
    // setter
    public void setClubName(String clubName) {
        if(clubName.length() < MIN_NAME_LENGTH) {
            System.out.println("Club name should be longer then " + MIN_NAME_LENGTH);
            return;
        }
        this.clubName = clubName;
    }

    // getter
    public String getClubName() {
        return this.clubName;
    }
    public void setIntro(String intro) {
        if(intro.length() < MIN_INTRO_LENGTH) {
            System.out.println("Club intro should be longer then " + MIN_INTRO_LENGTH);
            return;
        }
        this.intro = intro;
    }
    public String getIntro() {
        return this.intro;
    }
    public String getId() {
        return this.id;
    }
    public String getFoundationDay() {
        return this.foundationDay;
    }

    // test code
    public static TravelClub getSample() {
        String clubName = "Sample Club";
        String intro = "Sample Club Intro";
        TravelClub sampleClub = new TravelClub(clubName, intro);
        return sampleClub;

//        return new TravelClub("Sample Club", "SampleIntro");
    }

    // 어노테이션
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TravelClub club ID: ").append(id);
        builder.append(", ClubName: ").append(clubName);
        builder.append(", Intro: ").append(intro);
        builder.append(", FoundationDay: ").append(foundationDay);
        return builder.toString();
    }
}
