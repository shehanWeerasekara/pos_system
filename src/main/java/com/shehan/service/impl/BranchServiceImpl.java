package com.shehan.service.impl;

import com.shehan.exceptions.UserException;
import com.shehan.mapper.BranchMapper;
import com.shehan.model.Branch;
import com.shehan.model.Store;
import com.shehan.model.User;
import com.shehan.payload.dto.BranchDto;
import com.shehan.repository.BranchRepository;
import com.shehan.repository.StoreRepository;
import com.shehan.service.BranchService;
import com.shehan.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;
    private final StoreRepository storeRepository;
    private UserService userService;

    @Override
    public BranchDto createBranch(BranchDto branchDto, User user) throws UserException {

        User currentUser = userService.getCurrentUser();
        Store store = storeRepository.findByStoreAdminId(currentUser.getId());

        Branch branch = BranchMapper.toEntity(branchDto, store);
        Branch saveBranch = branchRepository.save(branch);

        return BranchMapper.toDto(saveBranch);
    }

    @Override
    public BranchDto updateBranch(Long id, BranchDto branchDto, User user) {
        return null;
    }

    @Override
    public BranchDto deleteBranch(Long id) {
        return null;
    }

    @Override
    public List<BranchDto> getAllBranchesByStoreId(Long storeId) {
        return List.of();
    }

    @Override
    public BranchDto getBranchById(Long id) {
        return null;
    }
}
