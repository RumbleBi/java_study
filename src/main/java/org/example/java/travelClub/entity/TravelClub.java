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
        this.intro = intro;
        this.foundationDay = DateUtil.today();
    }

    // methods
    // setter
    public void setClubName(String clubName) {
        if(clubName.length() < MIN_NAME_LENGTH) {
            System.out.println("Club name should be longer then 3");
            return;
        }
        this.clubName = clubName;
    }

    // getter
    public String getClubName() {
        return this.clubName;
    }

//    this 사용 예
//    public TravelClub(String clubName, String intro, String message) {
//        this(clubName, intro);
//        this.message = message;
//    }

}
