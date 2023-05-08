package com.example.miproyectofinall.dao

import androidx.room.*
import com.example.miproyectofinall.entidades.Repositorio

@Dao
interface RepositorioDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(repositorio: Repositorio)

    @Update()
    fun update(repositorio: Repositorio)

    @Delete()
    fun delete(repositorio: Repositorio)

    @Query("SELECT * FROM tbl_repositorio")
    fun select(repositorio: Repositorio)

}