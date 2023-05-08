package com.example.miproyectofinall.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.miproyectofinall.dao.RepositorioDao
import com.example.miproyectofinall.dao.UsuarioDao
import com.example.miproyectofinall.entidades.Repositorio
import com.example.miproyectofinall.entidades.Usuario

@Database(entities = arrayOf(Repositorio::class, Usuario::class), version = 1, exportSchema = false)
public abstract class ProjectDatabase : RoomDatabase() {

    abstract fun RepositorioDao(): RepositorioDao
    abstract fun UsuarioDao(): UsuarioDao

    companion object {

        @Volatile
        private var INSTANCE: ProjectDatabase? = null

        fun getDatabase(context: Context): ProjectDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProjectDatabase::class.java,
                    "gitCraft_database"
                ).build()
                INSTANCE = instance

                instance
            }
        }
    }
}