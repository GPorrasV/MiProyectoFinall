package com.example.miproyectofinall.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuario")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "nombreUsuario")
    val nombreUsuario: String,
    @ColumnInfo(name = "nombreCompleto")
    val nombreCompleto: String,
    @ColumnInfo(name="userToken")
    val userToken: String,
    @ColumnInfo(name="email")
    val email:String,
    @ColumnInfo(name = "urlPerfil")
    val urlPerfil:String,
    @ColumnInfo(name="numRepositorios")
    val numRepositorios: Int,
    @ColumnInfo(name="numSeguidores")
    val numSeguidores: Int,
    @ColumnInfo(name="numSeguidos")
    val numSeguidos: Int,
    @ColumnInfo(name="location")
    val location: String
)