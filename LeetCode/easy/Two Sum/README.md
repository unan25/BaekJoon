# [Easy] Two Sum

[문제링크](https://leetcode.com/problems/two-sum/description/)

## 성능요약
메모리: 44.7MB, 시간: 0.088초

## 문제 설명
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### 문제 번역
정수 배열 nums 과 정수가 주어지면 두 숫자의 합이 가 되는 인덱스를target 반환합니다 .target

각 입력에는 정확히 하나의 솔루션이 있다고 가정할 수 있으며 동일한 요소를 두 번 사용할 수 없습니다 .

어떤 순서로든 답변을 반환할 수 있습니다.


## 제약조건
- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109

## 입력형식
첫째 줄에 정수 배열 nums[] 와 정수 target이 주어진다.

## 출력형식
첫째 줄에 두 숫자의 합이 되는 인덱스를 반환 한다.

## 입출력 예시
<b>Example 1:</b><br/>
Input: nums = [2,7,11,15], target = 9<br/>
Output: [0,1]<br/>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<br/>

<b>Example 2:</b><br/>
Input: nums = [3,2,4], target = 6<br/>
Output: [1,2]<br/>

<b>Example 3:</b><br/>
Input: nums = [3,3], target = 6<br/>
Output: [0,1]