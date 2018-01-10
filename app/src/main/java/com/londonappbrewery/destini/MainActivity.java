package com.londonappbrewery.destini;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton, mBottomButton;

    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                    case 2:
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setBackgroundColor(getResources().getColor(R.color.colorReturn));
                        mBottomButton.setText(R.string.return_text);
                        mStoryIndex = 0;
                        break;
                    default:
                        mStoryTextView.setText(R.string.T1_Story);
                        mTopButton.setVisibility(View.VISIBLE);
                        mTopButton.setText(R.string.T1_Ans1);
                        mBottomButton.setText(R.string.T1_Ans2);
                        mStoryIndex = 1;
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        mStoryTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setText(R.string.return_text);
                        mBottomButton.setBackgroundColor(getResources().getColor(R.color.colorReturn));
                        mStoryIndex = 0;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setText(R.string.return_text);
                        mBottomButton.setBackgroundColor(getResources().getColor(R.color.colorReturn));
                        mStoryIndex = 0;
                        break;
                    default:
                        mBottomButton.setBackgroundColor(getResources().getColor(R.color.colorBottomButton));
                        mStoryTextView.setText(R.string.T1_Story);
                        mTopButton.setVisibility(View.VISIBLE);
                        mTopButton.setText(R.string.T1_Ans1);
                        mBottomButton.setText(R.string.T1_Ans2);
                        mStoryIndex = 1;
                        break;
                }
            }
        });

    }
}
