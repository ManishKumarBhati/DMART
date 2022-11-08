package com.bmk.baseproject.item

import android.view.View
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.ItemProductBinding
import com.bmk.baseproject.util.setImageWithGlide
import com.bmk.domain.ProductResponse
import com.bumptech.glide.Glide
import com.xwray.groupie.viewbinding.BindableItem

class ProductItem(val data: ProductResponse) : BindableItem<ItemProductBinding>() {

    override fun bind(viewBinding: ItemProductBinding, position: Int) {

        viewBinding.apply {
            tvName.text = data.name
            ivThumbnail.setImageWithGlide(data.imageUrl)
        }
    }

    override fun getLayout() = R.layout.item_product

    override fun initializeViewBinding(view: View): ItemProductBinding {
        return ItemProductBinding.bind(view)
    }

}