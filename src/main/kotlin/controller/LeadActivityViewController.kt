package com.example.CRM.controller

import com.example.CRM.dto.LeadActivityViewDTO
import com.example.CRM.service.LeadActivityViewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lead-activities")
class LeadActivityViewController(private val leadActivityViewService: LeadActivityViewService) {

    // Obtener todas las actividades de leads
    @GetMapping
    fun getAllLeadActivities(): List<LeadActivityViewDTO> {
        return leadActivityViewService.getAllLeadActivities()
    }

    // Obtener una actividad de lead por ID
    @GetMapping("/{id}")
    fun getLeadActivityById(@PathVariable id: Long): LeadActivityViewDTO {
        return leadActivityViewService.getLeadActivityById(id)
    }
}
