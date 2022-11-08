package com.bmk.baseproject.fragment

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import com.bmk.baseproject.R
import com.bmk.baseproject.databinding.FragmentThirdBinding
import com.bmk.baseproject.util.setImageWithGlide
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget


class ThirdFragment : BaseFragment() {
    lateinit var binding: FragmentThirdBinding
    override fun getLayout() = R.layout.fragment_third


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentThirdBinding.bind(view)
//"https://img.freepik.com/free-photo/cool-geometric-triangular-figure-neon-laser-light-great-backgrounds-wallpapers_181624-9331.jpg?w=2000"
//            "https://img.freepik.com/free-vector/night-ocean-landscape-full-moon-stars-shine_107791-7397.jpg?w=2000"
//            "https://duet-cdn.vox-cdn.com/thumbor/0x0:2160x3840/1440x2560/filters:focal(1080x1920:1081x1921):format(webp)/cdn.vox-cdn.com/uploads/chorus_asset/file/22963726/The_Verge_Wallpaper_Pixel_6_Pro.jpg"

        binding.ivThumbnail.setImageWithGlide("https://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
    }
}