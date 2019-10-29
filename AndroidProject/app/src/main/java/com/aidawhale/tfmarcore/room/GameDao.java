package com.aidawhale.tfmarcore.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GameDao {

    @Insert
    void insert(Game game);

    @Query("SELECT id FROM game")
    List<Integer> getAllGames();

    @Query("SELECT * FROM game WHERE user LIKE :userid")
    List<Game> getGamesByUser(String userid);

}
