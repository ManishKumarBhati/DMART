package com.bmk.baseproject.item

import android.view.View
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.ItemBannerBinding
import com.bmk.baseproject.util.setImageWithGlide
import com.bmk.domain.ProductResponse
import com.bumptech.glide.Glide
import com.xwray.groupie.viewbinding.BindableItem

class BannerItem(val data: ProductResponse) : BindableItem<ItemBannerBinding>() {

    override fun bind(viewBinding: ItemBannerBinding, position: Int) {
        viewBinding.apply {
            tvLabel.text = data.name
            ivThumbnail.setImageWithGlide(data.imageUrl)
        }
    }

    override fun getLayout() = R.layout.item_banner

    override fun initializeViewBinding(view: View): ItemBannerBinding {
        return ItemBannerBinding.bind(view)
    }

}