/*
 * Copyright (C) 2017 Moez Bhatti <moez.bhatti@gmail.com>
 *
 * This file is part of QKSMS.
 *
 * QKSMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * QKSMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with QKSMS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.moez.QKSMS.feature.conversationinfo

import androidx.lifecycle.ViewModel
import com.moez.QKSMS.injection.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
class ConversationInfoActivityModule {

    @Provides
    @Named("threadId")
    fun provideIntent(activity: ConversationInfoActivity): Long = activity.intent.extras?.getLong("threadId") ?: 0L

    @Provides
    @IntoMap
    @ViewModelKey(ConversationInfoViewModel::class)
    fun provideConversationInfoViewModel(viewModel: ConversationInfoViewModel): ViewModel = viewModel

}