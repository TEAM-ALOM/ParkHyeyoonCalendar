package com.mycalendar.app

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class DayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day)

        val dayboxlist = arrayListOf(
            Daybox("5/9\nTue", "20:00 고독 특강 신청"),
            Daybox("5/10\nWed", "16:00 학원 알바"),
            Daybox("5/11\nThu", "18:30 학생회 회의\nex-oj 2022 1차 인증시험"),
            Daybox("5/12\nFri", "치과 예약\n18:30 ALOM"),
            Daybox("5/13\nSat", "21:00 TF팀 배치 회의"),
            Daybox("5/14\nSun", "기초계산과학 과제7\n기초계산과학 과제8\nTF팀 검토 제출"),
            Daybox("5/15\nMon", "19:00 TF팀 축제 회의\n애니 펜슬테스트#3")
        )

        rv_day.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_day.setHasFixedsize(true)

        rv_day.adapter = DayboxAdapter(dayboxlist)


    }
}