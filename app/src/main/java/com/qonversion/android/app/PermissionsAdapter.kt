package com.qonversion.android.app

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qonversion.android.sdk.dto.QPermission
import kotlinx.android.synthetic.main.table_row.view.*

class PermissionsAdapter(private val permissions: List<QPermission>) :
    RecyclerView.Adapter<PermissionsAdapter.RowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.table_row, parent, false)
        return RowViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        val permission = permissions[position]
        holder.itemView.apply {
            txtPermissionId.text = permission.permissionID
            txtProductId.text = permission.productID
            txtRenewStateLabel.text = permission.renewState.name
        }
    }

    override fun getItemCount(): Int {
        return permissions.size
    }

    inner class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}