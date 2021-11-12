package com.example.main.network.model

import com.example.main.domain.model.Subject
import com.example.main.domain.util.DomainMapper

class SubjectDtoMapper: DomainMapper<SubjectDto, Subject> {
    override fun mapToDomainModel(model: SubjectDto): Subject {
        return Subject(
            subjectId = model.subjectId,
            name = model.name
        )
    }

    override fun mapFromDomainModel(domainModel: Subject): SubjectDto {
        return SubjectDto(
            subjectId = domainModel.subjectId,
            name = domainModel.name
        )
    }

    fun toDomainList(initial: List<SubjectDto>): List<Subject> {
        return initial.map {mapToDomainModel(it)}
    }

    fun fromDomainList(initial: List<Subject>): List<SubjectDto> {
        return initial.map {mapFromDomainModel(it)}
    }

}