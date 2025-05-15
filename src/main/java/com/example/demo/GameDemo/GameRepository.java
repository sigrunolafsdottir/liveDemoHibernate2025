package com.example.demo.GameDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByName(String name);
    Game findByGrade(String name);

    @Query("select distinct grade from Game")
    public List<String> getDistinctGrades();


    @Modifying
    @Transactional
    @Query("update Game set name=:newName where name=:oldName")
    public void updateGameName(String oldName, String newName);


    @Modifying
    @Transactional
    @Query("update Game set name=?2 where name=?1")
    public void updateGameName2(@Param("oldName") String oldName, @Param("newName") String newName);

}
