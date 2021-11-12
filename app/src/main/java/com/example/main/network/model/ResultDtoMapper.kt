package com.example.main.network.model

import com.example.main.domain.model.Result
import com.example.main.domain.util.DomainMapper


class ResultDtoMapper: DomainMapper<ResultDto, Result> {
    override fun mapToDomainModel(model: ResultDto): Result {
        val mapper: LessonDtoMapper = LessonDtoMapper()
        return Result(
            schedule = LessonDtoMapper().toDomainList(model.result!!.schedule!!),
            subjects = SubjectDtoMapper().toDomainList(model.result!!.subjects!!)
        )
    }

    override fun mapFromDomainModel(domainModel: Result): ResultDto {
        TODO("Not yet implemented")
    }

}