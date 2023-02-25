package com.example.scp
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListUlamaAdapter(private val listUlama: ArrayList<Ulama>, private val context: Context) : RecyclerView.Adapter<ListUlamaAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_ulama,parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        holder.bindItem(listUlama[position])
        holder.itemView.setOnClickListener {
            val getData = listUlama.get(position)
            val  DetailName: String = getData.name
            val DetailDesc: String = getData.details
            val DetailPhoto: Int = getData.photo

            val moveToDetail = Intent(context, DetailActivity::class.java)
            moveToDetail.putExtra("mname", DetailName)
            moveToDetail.putExtra("mDetail", DetailDesc)
            moveToDetail.putExtra("mPhoto", DetailPhoto)
            context.startActivity(moveToDetail)
        }

    }

    override fun getItemCount(): Int {
        return listUlama.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(ulama: Ulama) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetails: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

            tvName.text = ulama.name
            tvDetails.text = ulama.detail
            imgPhoto.setImageResource(ulama.photo)
        }


    }
}