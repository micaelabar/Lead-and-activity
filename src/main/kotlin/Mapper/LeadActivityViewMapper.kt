package com.example.CRM.mapper



import com.example.CRM.Entity.LeadCustomerView
import com.example.CRM.dto.LeadActivityViewDTO




object LeadActivityViewMapper {

    fun toDto(leadActivityView: LeadCustomerView): LeadActivityViewDTO {
        return LeadActivityViewDTO(
            activityId = leadActivityView.activityId,
            activityDate = leadActivityView.activityDate,
            activityDescription = leadActivityView.activityDescription,
            customerId = leadActivityView.customerId,
            customerName = leadActivityView.customerName,
            customerEmail = leadActivityView.customerEmail,
            leadId = leadActivityView.leadId,
            leadName = leadActivityView.leadName,
            leadEmail = leadActivityView.leadEmail
        )
    }

    fun toEntity(leadActivityViewDto: LeadActivityViewDTO): LeadCustomerView {
        return LeadCustomerView(
            activityId = leadActivityViewDto.activityId,
            activityDate = leadActivityViewDto.activityDate,
            activityDescription = leadActivityViewDto.activityDescription,
            customerId = leadActivityViewDto.customerId,
            customerName = leadActivityViewDto.customerName,
            customerEmail = leadActivityViewDto.customerEmail,
            leadId = leadActivityViewDto.leadId,
            leadName = leadActivityViewDto.leadName,
            leadEmail = leadActivityViewDto.leadEmail
        )
    }
}