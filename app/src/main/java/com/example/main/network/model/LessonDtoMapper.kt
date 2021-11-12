package com.example.main.network.model

import com.example.main.domain.model.Lesson
import com.example.main.domain.util.DomainMapper

class LessonDtoMapper: DomainMapper<LessonDto, Lesson> {
    override fun mapToDomainModel(model: LessonDto): Lesson {
        return Lesson(
            subjectId = model.subjectId,
            type = model.type,
            startTime = model.startTime,
            endTime = model.endTime,
            day = model.day,
            location = model.location
        )
    }

    override fun mapFromDomainModel(domainModel: Lesson): LessonDto {
        return LessonDto(
            subjectId = domainModel.subjectId,
            type = domainModel.type,
            startTime = domainModel.startTime,
            endTime = domainModel.endTime,
            day = domainModel.day,
            location = domainModel.location
        )
    }

    fun toDomainList(initial: List<LessonDto>): List<Lesson> {
        return initial.map {mapToDomainModel(it)}
    }

    fun fromDomainList(initial: List<Lesson>): List<LessonDto> {
        return initial.map {mapFromDomainModel(it)}
    }

}