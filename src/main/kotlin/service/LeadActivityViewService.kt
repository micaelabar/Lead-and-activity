package com.example.CRM.service



import com.example.CRM.dto.LeadActivityViewDTO
import com.example.CRM.mapper.LeadActivityViewMapper
import com.example.CRM.repository.LeadActivityViewRepository
import org.springframework.stereotype.Service

@Service
class LeadActivityViewService(private val leadActivityViewRepository: LeadActivityViewRepository) {

    fun getAllLeadActivities(): List<LeadActivityViewDTO> {
        return leadActivityViewRepository.findAllLeadActivities()
            .map { LeadActivityViewMapper.toDto(it) }
    }

    fun getLeadActivityById(id: Long):LeadActivityViewDTO {
        val leadActivityView = leadActivityViewRepository.findLeadActivityById(id)
            ?: throw Exception("Lead Activity not found")
        return LeadActivityViewMapper.toDto(leadActivityView)
    }
}