package com.bmk.baseproject.item

import android.view.View
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.ItemCategoryBinding
import com.bmk.baseproject.util.setImageWithGlide
import com.bmk.domain.ItemsItem
import com.bumptech.glide.Glide
import com.xwray.groupie.viewbinding.BindableItem

class CategoriesItem(val data: ItemsItem) : BindableItem<ItemCategoryBinding>() {

    override fun bind(viewBinding: ItemCategoryBinding, position: Int) {
        viewBinding.apply {

            tvLabel.text = data.name
            ivThumbnail.setImageWithGlide(data.imageUrl)
        }
    }

    override fun getLayout() = R.layout.item_category

    override fun initializeViewBinding(view: View): ItemCategoryBinding {
        return ItemCategoryBinding.bind(view)
    }
    override fun getSpanSize(spanCount: Int, position: Int): Int {
        return spanCount / 3
    }
}