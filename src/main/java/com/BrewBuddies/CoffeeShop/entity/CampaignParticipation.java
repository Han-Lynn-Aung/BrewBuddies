package com.BrewBuddies.CoffeeShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "campaign_participation")
public class CampaignParticipation extends BaseEntity{
}
