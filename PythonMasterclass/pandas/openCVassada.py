import cv2

im_grey = cv2.imread('smallgray.png', 0)


im_grey = cv2.imread('smallgray.png', 1)

cv2.imwrite('newImage.png', im_grey)


