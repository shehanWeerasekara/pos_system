package com.shehan.service;

import com.shehan.model.User;
import com.shehan.payload.dto.BranchDto;

import java.util.List;

public interface BranchService {

    BranchDto createBranch(BranchDto branchDto, User user);
    BranchDto updateBranch(Long id, BranchDto branchDto, User user);
    BranchDto deleteBranch(Long id);
    List<BranchDto> getAllBranchesByStoreId(Long storeId);
    BranchDto getBranchById(Long id);
}
