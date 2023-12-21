package com.example.umc.service.storeservice;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.umc.domain.Review;
import com.example.umc.domain.Store;
import com.example.umc.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService {
    private final StoreRepository storeRepository;

    @Override
    public Optional<Store> isExistStore(Long storeId) {
        return storeRepository.findById(storeId);
    }

    @Override
    public Page<Review> getReviewList(Long StoreId, Integer page) {
        return null;
    }
}
