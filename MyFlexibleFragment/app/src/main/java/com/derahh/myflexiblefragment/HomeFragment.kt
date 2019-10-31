package com.derahh.myflexiblefragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_category.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_category){
            val mCategory = CategoryFragment()
            val mFragmentManager = fragmentManager as FragmentManager
            mFragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, mCategory, CategoryFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }

}
