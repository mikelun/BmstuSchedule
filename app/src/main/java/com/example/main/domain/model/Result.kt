package com.example.main.domain.model

data class Result (
    val schedule: List<Lesson> ?= null,
    val subjects: List<Subject> ?= null
)