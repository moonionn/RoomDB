package com.example.roomdb

import android.os.FileObserver.DELETE
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ProductDao {

    @Insert
    fun insertProd(pro: Product)

    @Query("SELECT * FROM products WHERE proName= :pro")
    fun findProd(pro: String): List<Product>

    @Query("DELETE FROM products WHERE proName= :pro")
    fun delProd(pro: String)

    @Query("SELECT * FROM products")
    fun getALL(): List<Product>
}