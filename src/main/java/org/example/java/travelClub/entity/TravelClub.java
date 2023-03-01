package org.example.java.travelClub.entity;

import java.util.UUID;

public class TravelClub {
    // Fields
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
        this();
        this.clubName = clubName; // 참조하고 있는 레퍼런스 변수를 가르킴. 인스턴스 객체가 여러개일 경우 구분할 수 있는 것.
        this.intro = intro;
    }

//    this 사용 예
//    public TravelClub(String clubName, String intro, String message) {
//        this(clubName, intro);
//        this.message = message;
//    }

}
