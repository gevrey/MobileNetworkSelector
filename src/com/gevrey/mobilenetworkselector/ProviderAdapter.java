/*
 * Copyright (C) 2011 asksven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gevrey.mobilenetworkselector;

import java.util.ArrayList;
import java.util.List;

import com.gevrey.mobilenetworkselector.data.Provider;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProviderAdapter extends BaseAdapter
{
    private Context context;

    private List<Provider> m_listData;
    

    public ProviderAdapter(Context context, List<Provider> listData)
    {
        this.context = context;
        this.m_listData = listData;        
    }

    public int getCount()
    {
    	int ret = 0;
    	if (m_listData != null)
    	{
    		ret = m_listData.size();
    	}
    	return ret;
    }

    public Object getItem(int position)
    {
        return m_listData.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
    	Provider entry = m_listData.get(position);
        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.provider_row, null);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.TextViewName);
       	tvName.setText(entry.getName());
                
        convertView.setOnClickListener(new OnItemClickListener(position));
        return convertView;
    }
    
    @Override
    public void notifyDataSetChanged()
    {
      super.notifyDataSetChanged();
    }
    
    private class OnItemClickListener implements OnClickListener
    {           
        private int m_iPosition;
        OnItemClickListener(int position)
        {
                m_iPosition = position;
        }
        
        @Override
        public void onClick(View arg0)
        {
        	Provider entry = (Provider) getItem(m_iPosition);
        }
    }
}

