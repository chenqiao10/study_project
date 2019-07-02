package com.jd.zn.message.jms;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.*;
/**
 * @ Author     ：scw
 * @ Date       ：Created in 上午 11:30 2018/7/14 0014
 * @ Description：消息消费者
 * @ Modified By：
 * @Version: $version$
 */
public class MessageConsumer {
    //定义ActivMQ的连接地址
    private static final String ACTIVEMQ_URL = "tcp://192.168.1.0:61616";
    //定义发送消息的队列名称
    private static final String QUEUE_NAME = "MyMessage";
    public static void main(String[] args) throws JMSException {
        //创建连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //创建连接
        Connection connection = activeMQConnectionFactory.createConnection();
        //打开连接
        connection.start();
        //创建会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建队列目标
        Destination destination = session.createQueue(QUEUE_NAME);
        //创建消费者
        javax.jms.MessageConsumer consumer = session.createConsumer(destination);
        //创建消费的监听
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                TextMessage textMessage = (TextMessage) message;
                try {
                    System.out.println("获取消息：" + textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
 