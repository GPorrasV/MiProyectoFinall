package com.example.miproyectofinall.dao

import androidx.room.*
import com.example.miproyectofinall.entidades.Usuario

@Dao
interface UsuarioDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(usuario: Usuario)

    @Update()
    fun update(usuario:Usuario)

    @Delete()
    fun delete(usuario: Usuario)

    @Query("SELECT * FROM tbl_usuario")
    fun select(usuario:Usuario)

}