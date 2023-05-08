package com.example.miproyectofinall.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_repositorio")
data class Repositorio (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name = "idRepoLocal")
    val idRepoLocal: Int,
    @ColumnInfo(name = "nombre")
    val nombre:String,
    @ColumnInfo(name = "descripcion")
    val descripcion:String,
    @ColumnInfo(name = "autor")
    val autor:String,
    @ColumnInfo(name = "lenguaje")
    val lenguaje:String,
    @ColumnInfo(name = "urlRepositorio")
    val url:String,
    @ColumnInfo(name="fechaCreacion")
    val fechaCreacion: String
)