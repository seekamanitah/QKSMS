package com.moez.QKSMS.ui.messages

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.view.View
import com.moez.QKSMS.R
import com.moez.QKSMS.ui.base.QkFragment
import kotlinx.android.synthetic.main.message_list_fragment.*
import javax.inject.Inject

class MessageListFragment : QkFragment() {

    @Inject lateinit var viewModel: MessageListViewModel

    override fun provideLayoutRes(): Int = R.layout.message_list_fragment
    override fun provideMenuRes(): Int = R.menu.messages

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        val layoutManager = LinearLayoutManager(context)
        layoutManager.stackFromEnd = true
        messageList.layoutManager = layoutManager
        messageList.adapter = MessageAdapter(context, viewModel.messages)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            else -> super.onOptionsItemSelected(item)
        }
    }

}