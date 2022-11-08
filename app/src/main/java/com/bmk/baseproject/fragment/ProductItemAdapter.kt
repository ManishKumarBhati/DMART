//package com.bmk.baseproject.fragment
//
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bmk.domain.ProductResponse
//
//class ProductItemAdapter(val data: List<ProductResponse>) :
//    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    public class RecyclerViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//    }
//
//    public class RecyclerViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//    }
//
//    override fun getItemCount() = data.size
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        when (viewType) {
//            0 -> RecyclerViewHolder1()
//            else -> RecyclerViewHolder2()
//        }
//    }
//
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        when (holder.itemViewType) {
//            0 -> holder as RecyclerViewHolder1
//            else -> holder as RecyclerViewHolder2
//        }
//    }
//}