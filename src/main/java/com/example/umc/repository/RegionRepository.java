package com.example.umc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.umc.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {}
