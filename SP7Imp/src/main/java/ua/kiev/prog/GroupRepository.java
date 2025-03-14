package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GroupRepository extends JpaRepository<Group, Long> {
    @Modifying
    @Query("DELETE Group g WHERE g.name = :groupS")
    void deleteByGroupNameG(String groupS);
}
