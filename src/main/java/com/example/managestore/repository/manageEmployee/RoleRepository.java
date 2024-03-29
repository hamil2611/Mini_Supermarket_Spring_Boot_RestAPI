package com.example.managestore.repository.manageEmployee;

import com.example.managestore.entity.employee.Role;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    boolean existsByName(@Param(value = "name") String name);

    @CacheEvict(value = "findAllRole")
    Page<Role> findAll(Pageable pageable);

    @CacheEvict(value = {"findAllRole"}, allEntries = true)
    Role save(Role role);
}