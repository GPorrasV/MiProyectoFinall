package com.example.miproyectofinall.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuario")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "nombreCompleto")
    val nombreCompleto: String,
    @ColumnInfo(name = "nombreUsuario")
    val nombreUsuario: String,
    @ColumnInfo(name="email")
    val email:String,
    @ColumnInfo(name = "urlPerfil")
    val urlPerfil:String,
    @ColumnInfo(name="num_repositorios")
    val repositorios: String

)