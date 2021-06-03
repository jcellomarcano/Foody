package com.jcellomarcano.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jcellomarcano.foody.models.FoodRecipe
import com.jcellomarcano.foody.utils.Constants.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}