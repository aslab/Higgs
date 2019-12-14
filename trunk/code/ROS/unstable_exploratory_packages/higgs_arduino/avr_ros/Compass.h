/* Compass.h
 * MSG file auto generated by "Rutgers avr_bridge"
 */
#ifndef COMPASS_H_
#define COMPASS_H_
#include "avr_ros/Msg.h"
#include "avr_ros/vector.h"
#include "avr_ros/ros_string.h"
#include "avr_ros/Quaternion32.h"
namespace higgs_arduino {
	class Compass : public ros::Msg {
	public:
		virtual ros::MsgSz bytes();
		virtual ros::MsgSz serialize(uint8_t *out_buffer);
		virtual ros::MsgSz deserialize(uint8_t *data);
		higgs_arduino::Quaternion32 orientation;
		float orientation_covariance[9];
	}; /* class Compass */
} /* namespace higgs_arduino */
#endif /* COMPASS_H_ */