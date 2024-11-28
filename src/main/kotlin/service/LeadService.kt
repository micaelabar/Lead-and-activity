package com.example.CRM.service


import com.example.CRM.dto.LeadDTO
import com.example.CRM.mapper.Lead

import com.example.CRM.repository.LeadRepository
import org.springframework.stereotype.Service

@Service
class LeadService(private val leadRepository: LeadRepository) {

    fun getAllLeads(): List<LeadDTO> {
        return leadRepository.findAll().map { Lead.toDto(it) }
    }

    fun createLead(leadDto: LeadDTO): LeadDTO {
        val lead = Lead.toEntity(leadDto)
        val savedLead = leadRepository.save(lead)
        return Lead.toDto(savedLead)
    }

    fun getLeadById(id: Long): LeadDTO {
        val lead = leadRepository.findById(id).orElseThrow { Exception("Lead not found") }
        return Lead.toDto(lead)
    }
}