package com.jcellomarcano.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jcellomarcano.foody.models.Result
import com.jcellomarcano.foody.utils.Constants.FAVOURITE_RECIPES_TABLE

@Entity(tableName = FAVOURITE_RECIPES_TABLE)
class FavouritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)