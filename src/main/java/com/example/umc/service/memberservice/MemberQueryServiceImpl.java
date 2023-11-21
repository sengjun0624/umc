package com.example.umc.service.memberservice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.umc.domain.Member;
import com.example.umc.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberQueryServiceImpl implements MemberQueryService {

    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public boolean existMember(Long memberId) {
        return memberRepository.existsById(memberId);
    }

    @Override
    @Transactional
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId).get();
    }
}
