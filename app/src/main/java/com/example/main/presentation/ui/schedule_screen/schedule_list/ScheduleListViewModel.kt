package com.example.main.presentation.ui.schedule_screen.schedule_list

import androidx.lifecycle.ViewModel
import com.example.main.repository.ResultRepository
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

class ScheduleListViewModel
@ViewModelScoped
constructor(
    private @Named("sessionId") val sessionId: String,
    private val repository: ResultRepository,
): ViewModel() {
    init {
    }

    fun getSessionId() = sessionId

    fun getRepository() = repository
}